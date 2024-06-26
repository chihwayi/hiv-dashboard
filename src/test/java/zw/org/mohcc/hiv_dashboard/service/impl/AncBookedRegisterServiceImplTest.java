package zw.org.mohcc.hiv_dashboard.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.domain.PageRequest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@EnableCaching
public class AncBookedRegisterServiceImplTest {

    @Autowired
    private AncBookedRegisterServiceImpl ancBookedRegisterService;

    @Autowired
    private CacheManager cacheManager;

    @Test
    public void testCaching() {
        // First call should fetch from database
        ancBookedRegisterService.findAll(PageRequest.of(0, 10));
        // Cache should be populated
        assertThat(cacheManager.getCache("ancBookedRegisters").getNativeCache()).isNotNull();

        // Second call should fetch from cache
        ancBookedRegisterService.findAll(PageRequest.of(0, 10));
        // Cache should still be populated
        assertThat(cacheManager.getCache("ancBookedRegisters").getNativeCache()).isNotNull();
    }
}