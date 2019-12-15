package com.xiaofei.handler;

import com.xiaofei.entity.FlimVideo;
import com.xiaofei.entity.User;
import com.xiaofei.server.FlimVideoTableServer;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@SessionAttributes
@Controller
public class TextDispatcher {

    @Autowired
    private FlimVideoTableServer flimVideoTableServer;

    private static final Log log = LogFactory.getLog(FlimVideoTableServer.class);

    @RequestMapping(value = "/sucess")
    public String text(Model model) {
//    ModelAndView model = new ModelAndView("/sucess.jsp");
        FlimVideo flimVideo = flimVideoTableServer.selectByname("喜欢你");
        model.addAttribute("flim", flimVideo);
//        model.addObject("flim",flimVideo);
        return "sucess.jsp";
    }

    //   @ModelAttribute("user")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String formatterTest(@ModelAttribute User user, Model model) {
        log.info(user);
        model.addAttribute("user", user);
        return "sucess.jsp";
    }

    @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file, HttpServletRequest request, @RequestParam("filename") String miao) throws IOException {
        if (!file.isEmpty()) {
            String path = "E://upload";
            String filename = file.getOriginalFilename();
            File file1 = new File(path, filename);
            if (!file1.getParentFile().exists()) {
                file1.getParentFile().mkdirs();
            }
            file.transferTo(new File(path + File.separator + filename));
            System.out.println("成功");
            return "uploadsucess.jsp";
        }
        return "index.jsp";

    }
    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(@RequestParam("filename") String filename) throws IOException {
        String path = "E://upload";
        File file = new File(path + File.separator + filename);
        System.out.println(filename);
        HttpHeaders headers = new HttpHeaders();
     String  filepath = new String(filename.getBytes(),"iso-8859-1");
        headers.setContentDispositionFormData("attachment",filepath);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);
    }

}
