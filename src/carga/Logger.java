package carga;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static BufferedWriter bufferedWriter;
    private static String logPath = "logger/";

    public static BufferedWriter getOrCreateFileWriter() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String fechaFormateada = simpleDateFormat.format(new Date());
        logPath += fechaFormateada + ".log";

        if (bufferedWriter != null)
            return bufferedWriter;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(logPath, true));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return bufferedWriter;
    }

    public static void write(String line) {
        try {
            String fechaFormateada = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            String mensajeFormateado = "[" + fechaFormateada + "] " + line;
            getOrCreateFileWriter().write(mensajeFormateado);
            getOrCreateFileWriter().newLine(); // Agregar una nueva línea después del mensaje
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close(){
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
