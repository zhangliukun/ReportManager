package com.zzsys.threet.controller;

import com.zzsys.threet.ThreetApplication;
import com.zzsys.threet.entity.Admin;
import com.zzsys.threet.service.AdminService;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.HashMap;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ThreetApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AdminControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;


    //Get请求
    @Test
    public void getRequest(){
        ResponseEntity<String> entity = testRestTemplate.getForEntity("/admin/{id}",String.class,1);
        System.out.println(entity.getBody());
    }

    /**
     * GET请求
     * getForEntity 和 getForObject 的区别：
     * getForObject返回结果Controller中的返回类型。
     * getForEntity返回结果里包含了请求头信息等，同时entity.getBody()的结果已经被转换成了json字符串
     */
    @Test
    public void getRequest2() {
        String result = testRestTemplate.getForObject("/admin/test", String.class);
        System.err.println(result);
    }

    /**
     * GET请求除了使用占位符的方式按次序注入，也可以通过一个map通过名字注入
     */
//    @Test
//    public void getRequest3() {
//        Map<String, Object> param = new HashMap<>();
//        param.put("bookid", 20);
//        param.put("name", "呼啸山庄");
//        String result = testRestTemplate.getForObject("/getBookInfo2?id={bookid}&name={name}", String.class, param);
//        System.err.println(result);
//    }

    /**
     * POST请求
     */
    @Test
    public void postRequest() {
        MultiValueMap<String, Admin> param = new LinkedMultiValueMap<>();
        Admin ad = new Admin();
        ad.setName("test1");
        ad.setAge(21);
        param.add("admin",ad);
        String result = testRestTemplate.postForObject("/admin/", ad, String.class);
        System.err.println(result);
    }

    /**
     * POST请求，并带请求头
     */
//    @Test
//    public void postRequest2() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("token", "aaaaaaabbbbbbdcccc");
//
//        MultiValueMap<String, Object> param = new LinkedMultiValueMap<>();
//        param.add("id",2);
//
//        HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<>(param, headers);
//
//        ResponseEntity<String> resultEntity = testRestTemplate.postForEntity("/postBookInfo", entity, String.class);
//        System.err.println("reuslt:" + resultEntity.getBody());
//        System.err.println("headers:" + resultEntity.getHeaders());
//    }

    /**
     * POST请求，入参是json格式字符串：{"id":2,"name":"Effective Java","author":"Joshua Bloch","price":39.0}
     */
//    @Test
//    public void postRequest3() {
//        String jsonStr = "{\"id\":2,\"name\":\"Effective Java\",\"author\":\"Joshua Bloch\",\"price\":39.0}";
//        HttpHeaders headers = new HttpHeaders();
//
//        //设置contentType
//        headers.setContentType(MediaType.valueOf("application/json;UTF-8"));
//
//        HttpEntity<String> entity = new HttpEntity<String>(jsonStr,headers);
//        String result = testRestTemplate.postForObject("/postJson", entity, String.class);
//        System.err.println(result);
//    }

    /**
     * 上传文件
     *
     * @throws Exception
     */
//    @Test
//    public void upload() throws Exception {
//        Resource resource = new FileSystemResource("d:/123.jpg");
//        MultiValueMap<String, Object> param = new LinkedMultiValueMap<>();
//        param.add("files", resource);
//        String result = testRestTemplate.postForObject("/uploadFile", param, String.class);
//        System.out.println(result);
//    }

    /**
     * 下载文件
     *
     * @throws Exception
     */
//    @Test
//    public void download() throws Exception {
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("token", "xxxxxx");
//        HttpEntity formEntity = new HttpEntity(headers);
//
//        ResponseEntity<byte[]> response = testRestTemplate.exchange("/download?file={1}", HttpMethod.GET, formEntity, byte[].class, "d:/aaa.png");
//        if (response.getStatusCode() == HttpStatus.OK) {
//            FileUtils.writeByteArrayToFile(new File("d:/123.jpg"), response.getBody());
//        }
//    }


}
