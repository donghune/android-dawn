# android-dawn

안드로이드를 개발하면서 비슷한 프로젝트 생성에 귀찮아 템플릿 프로젝트를 제작하였습니다.

대부분의 소스는 https://github.com/android/nowinandroid 를 참고하였습니다.

기본적인 레이어와 모듈 구성을 각 개발자마다 다르기에 추가하지 않고, app 모듈 1개만 존재합니다.

라이브러리 버전은 버전 카탈로그를 통해 관리 합니다.

> 자바 & 코틀린 라이브러리 모듈의 build.gradle 은 아래와 같이 설정해주세요.

``` kotlin
plugins {
    `java-library`
    kotlin("jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
```

> 안드로이드 라이브러리 모듈의 build.gradle 은 아래와 같이 설정해주세요.

``` kotlin
plugins {
    id("dawn.android.library")
}

android {
    namespace = "io.github.dawn"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies { ... }
```

> 프로젝트 명은 tools/replace.sh 를 사용하면 쉽게 모든 파일을 바꿀 수 있습니다.
> 
> 권한 때문에 작동이 안될경우 직접 터미널에서 입력해주세요, 모든 코드는 맥을 기준으로 작성되었습니다.