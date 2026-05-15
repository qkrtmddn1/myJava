public class Exam2 { // 어디서든 접근 가능한 Exam02 클래스를 선언합니다.
    public static void main(String[] args) { // 프로그램의 시작점인 메인 메서드를 선언합니다.

        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200"; // 분석할 대상인 원본 로그 문자열을 log 변수에 저장합니다.

        int space = log.indexOf(" ", log.indexOf("\"")); // 큰따옴표(\")의 위치를 찾은 후, 그 뒤에 나오는 첫 번째 공백(" ")의 인덱스 번호를 구합니다.

        String res = log.substring(space + 1, log.indexOf(" ", space + 1)); // 앞서 찾은 공백의 다음 칸(space + 1)부터 그 다음 공백이 나오기 전까지의 문자열만 잘라내어 res에 저장합니다.

        System.out.println(res); // 최종적으로 잘라낸 API 주소 문자열(/apache_pb.gif)을 화면에 출력합니다.

    } // 메인 메서드를 종료합니다.
} // Exam02 클래스를 종료합니다.