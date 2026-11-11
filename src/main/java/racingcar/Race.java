package racingcar;

import java.util.*;

public class Race {

    private LinkedHashMap<String, Integer> carList = new LinkedHashMap<>();
    private Integer count;

    public void race(String list, String number) { // String을 리스트, 횟수로 change
        String[] arr = list.split(",");
        for (String car : arr) {
            String trimmedCar = car.trim();
            if (trimmedCar.length() > 5 || trimmedCar.isEmpty()) {
                throw new IllegalArgumentException("이름은 5자 이하만 가능합니다.");
            }
            carList.put(trimmedCar, 0); // 앞뒤 공백 제거 후 map의 key, 0 추가
        }
        count = Integer.parseInt(number);
        if (count < 0)
            throw new IllegalArgumentException("양수만 입력 가능합니다.");

        Start start = new Start();
        start.start(carList, count);
    }
}
