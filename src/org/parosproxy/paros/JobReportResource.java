package org.parosproxy.paros;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/change")
public class JobReportResource {

    @RequestMapping("/{id}")
    public String queryJobListByDep(String depId) {
        return "你好";
    }

}
