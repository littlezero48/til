# String 타입 메소드

* String 길이

``` java
int a = String변수명.length();
```
<br>
스트링 변수에 들어있는 문자의 길이를 알려준다.   
하지만 공백도 문자의 길이에 포함되는 사실을 잊지말자.
<br><br>
array변수.length; 와 헷갈릴수 있는데 이건 배열의 길이를 알고자 할 때 사용된다.

----

* 문자열 비교
``` java
String a = "hi";
String b = "hi";
boolean c = a.equals(b);
// c = true
```
<br>
두 문자열 변수를 비교하는 함수.  
문자열 내용을 비교할 때는 반드시 equals를 사용해야한다.  
== 연산자와의 비교랑 차이가 있기때문!

equals 메소드는 대상 내용 자체를 비교하지만  
== 연산자는 대상의 주소값을 비교한다.
이는 CBV(Call By Value)와 CBR(Call By Reference)의 차이로 발생  

이 차이에 대해선 다른 md에 정리하고 링크 걸 예정  

----

