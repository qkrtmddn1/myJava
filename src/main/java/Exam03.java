public class Exam03 {
    public static void main(String[] args) {

        // 문제에서 주어진 배열
        int[] nums = {1, 3, 7, 1, 4, 7, 3, 1, 9, 0, 7, 3};

        // 1. 가장 큰 값을 저장할 변수를 배열의 첫 번째 값으로 시작
        int max = nums[0];

        // 2. for문을 통해 배열의 모든 요소를 하나씩 확인
        for (int i = 0; i < nums.length; i++) {

            // 3. if문 사용: "지금 보고 있는 숫자(nums[i])가 내가 아는 최대값(max)보다 큰가?"
            if (nums[i] > max) {
                // 더 큰 숫자를 발견하면 max 변수를 그 숫자로 교체함
                max = nums[i];
            }
        }
        //결과 출력
        System.out.println(max + " 입니다.");
    }
}