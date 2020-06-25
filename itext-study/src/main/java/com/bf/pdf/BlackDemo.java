package com.bf.pdf;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class BlackDemo {
    public static void main(String args[]) {
        try {
            // create a new document
            Document document = new Document(PageSize.A4, 20, 20, 20, 20);
            PdfWriter.getInstance(document, new FileOutputStream("D:/iTextDemo/BlankDemo.pdf"));

            document.open();

            document.add(new Paragraph("Hello, World!"));
            document.add(new Paragraph("Hello, World!"));

            // add a couple of blank lines
            document.add(Chunk.NEWLINE); // 分割段落好使
            document.add(Chunk.NEWLINE);

            // add one more line with text
            document.add(new Paragraph("Hello, World!"));

            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
