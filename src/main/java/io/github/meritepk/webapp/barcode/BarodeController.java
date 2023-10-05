package io.github.meritepk.webapp.barcode;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

@RestController
@RequestMapping("/api/v1/barcodes")
public class BarodeController {

    private final BarcodeService service;

    public BarodeController(BarcodeService service) {
        this.service = service;
    }

    @GetMapping(value = "/qrcode")
    public ResponseEntity<StreamingResponseBody> qrcode(
            @RequestParam(name = "text", defaultValue = "https://meritepk.github.io/") String text) {
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(out -> service.qrcode(text, BarcodeService.PNG, out));
    }
}
