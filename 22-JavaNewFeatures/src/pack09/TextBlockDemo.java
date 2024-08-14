package pack09;

public class TextBlockDemo {
    public static void main(String[] args) {
        String studentName = "Tejas";
        int studentAge = 21;
        String html = """
                <html>
                    <body>
                        <h1>Hello, %s</h1>
                        <h2>You %d year old</h2>
                    </body>
                </html>
                """.formatted(studentName, studentAge);
        System.out.println(html);
    }
}
