package io.github.meritepk.webapp.barcode;

import java.io.OutputStream;

import org.springframework.stereotype.Service;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

@Service
public class BarcodeService {

    public static final int QR_CODE_SIZE = 240;
    public static final String PNG = "PNG";

    public void qrcode(String text, String format, OutputStream out) {
        try {
            QRCodeWriter writer = new QRCodeWriter();
            BitMatrix matrix = writer.encode(text, BarcodeFormat.QR_CODE, QR_CODE_SIZE, QR_CODE_SIZE);
            MatrixToImageWriter.writeToStream(matrix, format, out);
        } catch (Exception e) {
            throw new IllegalStateException("Error generating QR Code", e);
        }
    }
}
