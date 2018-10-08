package com.cloud.pay.recon;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cloud.pay.recon.service.ReconService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class ReconTest {
	
	@Autowired
	private ReconService reconService;
	
	/**
	 * 生成商户对账文件
	 */
	@Test
	public void createMerchantReconFile() {
		int result = reconService.createMerchantReconFile("2018-10-06");
		System.out.println(result);
	}
}