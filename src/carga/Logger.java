package carga;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static BufferedWriter bufferedWriter;
    private static String logPath = "logger/";
    private static String logFilePath; // Variable para almacenar la ruta del archivo de log

    public static BufferedWriter getOrCreateFileWriter() {

        if (bufferedWriter != null)
            return bufferedWriter;
        
        // Verificar si la ruta completa del archivo de log no está establecida
        if (logFilePath == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            String fechaFormateada = simpleDateFormat.format(new Date());
            logFilePath = logPath + fechaFormateada + ".log";
        }

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(logFilePath, true));
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
            
            if (bufferedWriter != null) {
                bufferedWriter.close();
                bufferedWriter = null;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
