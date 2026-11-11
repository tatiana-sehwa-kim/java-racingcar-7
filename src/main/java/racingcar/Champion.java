package racingcar;

import java.util.*;

public class Champion {

    public void champion(LinkedHashMap<String, Integer> carList) {   // 값을 비교해서 우승자(키)를 프린트
        Integer maxValue = Collections.max(carList.values());
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> car : carList.entrySet()) {
            if (car.getValue().equals(maxValue)) {
                result.add(car.getKey());
            }
        }
        System.out.println("최종 우승자 : " + String.join(", ", result));
    }
}
