# 

# 변수

## var

변수란 값을 임시로 메모리에 저장하고 그 저장 공간에 이름을 부여한 것을 말한다.

변수는 이름 앞에 var를 입력해서 선언할 수 있는데 다음 두 가지 방법으로 선언하고 사용할 수 있습니다.

![https://cdn.discordapp.com/attachments/814387318735241219/1022753666031161344/2022-09-23_3.17.49.png](https://cdn.discordapp.com/attachments/814387318735241219/1022753666031161344/2022-09-23_3.17.49.png)

변수는 변수의 이름 앞에 var 를 입력해서 선언할 수 있는데 다음 두 가지 방법으로 선언하고 사용할 수 있습니다.

### 첫째. 변수 선언과 동시에 값 넣기

입력되는 값으로 타입을 추론할 수 있습니다. 값이 입력되는 순간 해당 값의 형태(문자, 숫자, 불린 등)로 변수의 타입이 결정됩니다.

> var 변수명(이름 ) = 값
> 

다음은 변수명 myName에 문자열 “홍길동”을 입력하는 예시입니다.

```kotlin
var myName = "홍길동"
```

### 둘째. 값으로 초기화 하지 않고 선언만 사용하기

선언만 할 경우에는 반드시 먼저 변수명 옆에 콜론(:) 구분자를 넣어서 타입(자료형)을 지정해야 합니다.

> var 변수명 : 타입
변수명 = 값
> 

다음은 변수명 myAge를 Int 타입으로 선언하고 다음 줄에서 숫자 ‘27’을 입력하는 예시입니다.

```kotlin
var myName : Int
myAge = 27
```

위의 두 가지 예시로 변수는 최초 선언 시에 타입이 결정된다는 것을 예상할 수 있습니다. 변수는 한번 타입을 결정하면 동일한 타입의 값만 담을 수 있습니다. 앞의 예제에서 Int 값인 27이 있는 변수 myAge에는 문자열 “홍길동”을 입력할 수 없습니다.


## 데이터 타입

코틀린에서 제공하는 기본 데이터 타입은 다음과 같습니다

| 구분 | 데이터 타입 | 설명 | 값의 범위 및 예 |
| --- | --- | --- | --- |
| 숫자형 | Double | 64비트 실수 | -1.7E+308의 근삿값 +1.7E+308의 근삿값  |
|  | Float | 32비트 실수 | -3.4E+38의 근삿값 ~ 3.4E+38의 근삿값 |
|  | Long | 64비트 정수 | -2E63 ~ 2E63-1 |
|  | Int | 32비트 정수 | -2,147,483,648 ~ 2,147,483,647 |
|  | Short | 16비트 정수 | -32,768 ~ 32,767 |
|  | Byte | 8비트 정수 | -128 ~ 127 |
| 문자형 | Char | 1개의 문자 | “글” (외따옴표) |
|  | String | 여러 개의 문자 | “여러 개의 글자입니다.” (쌍따옴표) |
| 불린형 | Boolean | true, false 두 가지 값 | true 또는 false |