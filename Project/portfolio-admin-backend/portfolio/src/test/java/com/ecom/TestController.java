//package com.ecom;
//
//import com.ecom.dto.PortfolioRequestDto;
//import com.ecom.entity.AboutMeEntity;
//import com.ecom.repository.AboutMeRepository;
//import com.ecom.service.AboutMeServiceImpl;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
////@ExtendWith(SpringExtension.class)
//@SpringBootTest
//@AutoConfigureMockMvc
//public class TestController {
//
//    @Autowired
//    private MockMvc mockMvc;
//    @InjectMocks
//    private AboutMeServiceImpl aboutMeService;
//    @Test
//    public void AboutMeService_findUserById() throws Exception {
//        AboutMeEntity aboutMe = AboutMeEntity.builder().aboutMeId(1L).portfolioUserId(1L).description("").build();
//        Mockito.when(aboutMeService.findAboutMe(1L)).thenReturn(aboutMe);
//        ObjectMapper Obj = new ObjectMapper();
//        Obj.writeValueAsString(PortfolioRequestDto.builder().portfolioId(1L).build());
//        RequestBuilder requestBuilder = MockMvcRequestBuilders.post(
//                "/api/aboutme/").accept(
//                MediaType.APPLICATION_JSON).param(Obj.toString());
//        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
//        System.out.println(result.getResponse());
//    }
//    @Test
//    public void testYourEndpoint() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.post("/api/aboutme/"))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//    }
//}
