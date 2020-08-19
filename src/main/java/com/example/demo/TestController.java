package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    class TestoutReturn {
        private String result;

        public TestoutReturn() {

        }

        public TestoutReturn(String r) {
            this.result = r;
        }

        public String getResult() {
            return this.result;
        }

        public void setResult(String r) {
            this.result = r;
        }
    }

    @GetMapping("/api/testout")
    public TestoutReturn testout() {
        return new TestoutReturn("It works.");
    }
}