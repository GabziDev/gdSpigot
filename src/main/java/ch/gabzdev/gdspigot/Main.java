package ch.gabzdev.gdspigot;

public class Main {
    public static void init() {
        StringBuilder logo = new StringBuilder();

        logo.append("           _ _____       _             _   \n");
        logo.append("          | /  ___|     (_)           | |  \n");
        logo.append("  __ _  __| \\ `--. _ __  _  __ _  ___ | |_ \n");
        logo.append(" / _` |/ _` |`--. \\ '_ \\| |/ _` |/ _ \\| __|\n");
        logo.append("| (_| | (_| /\\__/ / |_) | | (_| | (_) | |_ \n");
        logo.append(" \\__, |\\__,_\\____/| .__/|_|\\__, |\\___/ \\__|\n");
        logo.append("  __/ |           | |       __/ |          \n");
        logo.append(" |___/            |_|      |___/           \n");

        System.out.println(logo);
        System.out.println("Server starting in 5 seconds...");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
