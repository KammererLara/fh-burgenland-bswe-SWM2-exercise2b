package io.muehlbachler.bswe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *Controller used for Rest-API
 */
@RestController
public class StringController {
    /**
     *used StringService for changing String to Uppercase-String
     */
    @Autowired
    private StringService stringService = new StringService();

    /**
     * api endpoint for changing string to uppercase at "/upper"
     * @param text wanted string to get returned in uppercase
     * @return uppercase string associated with param string
     */
    @GetMapping("/upper")
    String upper(@RequestParam(value = "string") final String text) {
        return stringService.toUpperCase(text);
    }
}
