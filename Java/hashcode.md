# 객체의 고유한 값 (HashCode)

</br>

## hashCode()

```java
[Reference Type] a = "object";
int a_hashCode = a.hashCode();
```

객체의 `고유한 값`을 반환한다. (메모리 주소 값이 아니다)

다만, String클래스와 Integer클래스 같이 오버라이딩 된 클래스라면 메모리 주소가 아닌 다른 것을 반환하는데

- `String`클래스에서의 hashCode()는 equals()가 리턴한 값이 true이면 같은 hashCode값을 리턴하고, false이면 두 hashCode값이 다르게 리턴되도록 오버라이딩되어 있다.

- `Integer`클래스에서의 hashCode()는 해당 정수 값을 리턴하도록 오버라이딩 되어 있다.
  
  등...

</br>

----

</br>

## System.identityHashCode()

```java
[Reference Type] a = "object";
int a_hashCode = a.identityHashCode();
```

객체의 `고유한 값`을 반환한다. (메모리 주소 값이 아니다)

System.identityHashCode() 메소드는 오버라이드 되지 않고 고유한 값을 리턴한다.

</br>

----

[관련 의문사항 링크](https://stackoverflow.com/questions/1961146/memory-address-of-variables-in-java)
