# 오픈소스 소프트웨어(Open Source Software)
소프트웨어의 소스코드를 자유롭게 읽고, 수정 및 재배포가 가능한 것. 누구나 특별한 제한 없이 그 코드를 보고 사용할 수 있는 오픈소스 라이선스를 만족하는 소프트웨어.  

### OSI(Open Source Initiative)
공개 소스 정의(OSD)의 관리 및 촉진을 담당하는 비영리 조합. OSI가 인증하는 공개 소스 소프트웨어(OSS) 인증 마크는 소프트웨어가 실제로 공개 소스라는 것을 증명한다.

### 자유 소프트웨어(Free Software)
- 리처드 스톨먼이 설립
- GNU 프로젝트와 관련된 소프트웨어에서 자유를 중시
    - 요리의 기본 레시피를 보고 그걸 응용하여 더 나은 요리를 만들듯이, 소프트웨어 개발도 그렇게 이루어질 수 있다
    - Free는 '무료'가 아닌 '자유'의 뜻으로 사용 됨
- Copyleft(Copyright과 반대되는 개념)
    - 제작자의 저작권은 인정하면서 어느 누구나 소프트웨어를 복제해 사용할 수 있는 권리를 주어야 한다는 개념
- 자유 소프트웨어가 오픈소스 소프트웨어의 시초

### 오픈소스 지원 관리 서버
- 소스코드를 통해 여러 개발자가 협업하고 공유하며 이를 지원하는 방안을 마련
    - GitHub, GitLab, BitBucket 등
- 오픈소스 커뮤니티 내의 사고 및 협업 양식
    - 커뮤니티에서 개발된 아이디어와 소프트웨어를 교환
    - 창의적이고 과학적이며, 기술적인 발전을 이끌어낼 수 있음

### 협업 방식
- 서로 간에 소스코드를 사용, 변경 및 공유할 수 있도록 커뮤니티 프로덕션과 동료 평가에 의존
- 개발자들은 보다 혁신적인 소프트웨어 솔루션을 만들기 위해 인사이트, 아이디어 및 코드를 공유
- 모든 사용자가 재활용성과 접근성을 향상시키기 위해 이를 수정, 개선 및 재분배할 수 있도록 보장
- 대규모 협업의 기본 원칙으로 운용
    - 일반 사용자를 위한 보다 지속 가능한 소프트웨어 개발을 구축

### 장점
- 누구든 보다 쉽게 연구하여 새로운 프로그래밍 기술을 개발 가능
    - 학생은 오픈소스 라이센스를 통해 코드를 편집하고 친구 또는 보다 광범위한 커뮤니티와 공유
    - 기존 오픈소스 프로젝트를 수정해 실질적응로 커뮤니티에 기여하는 등 실습이 가능
- 기업이 구체적인 요구사항에 맞게 커스터마이징 가능
- 원래 소스코드에는 포함되어 있지 않았던 새로운 사용자 경험으로 혁신할 수 있도록 지원

### 단점
- 공개의 의무
- 품질보증 및 유지보수, 보안 등의 어려움  
<br>
<br>

## 오픈소스 소프트웨어 저작권
오픈소스 SW 개발자가 정한 저작권의 범위에 따라 해당 소프트웨어를 사용해야 함. 위반할 경우, 라이선스 위반 및 저작권 침해로 이에 대한 법적 책임이 따름

- FOSS 라이선스
    - 반환 의무(소스 공개 의무)
        - 특허조항
            - EPL
            - MPL
            - AGPL 3.0
            - GPL 3.0
        - GPL 2.0
        - LGPL 2.1
    - 반환 불필요
        - 제약
            - BSD
            - Apache 2.0
        - 무제약
            - MIT
- 비 FOSS 라이선스  

```
⚠️ 소스코드 반환의무가 있는 라이선스들(GPL, AGPL, LGPL, MPL, EPL 등)을 사용할 때는 코드가 포함된 SW의 소스코드를 공개해야 함. 특히, 영업비밀, 핵심 기술 등이 외부로 유출될 수 있으므로 주의해야 함.
```

### GPL
- 자유소프트웨어재단(FSS)에서 만든 라이선스
- 가장 많이 알려진 Copyleft에 속한 라이선스
- 프로그램은 목적이나 형태의 제한 없이 사용 가능
- 프로그램을 이후 수정하고 배포하는 모든 경우에 무조건 GPL로 공개해야 함
    - GPL을 따른 프로그램을 사용해서 2차 저작물을 만들면 2차 저작물도 반드시 GPL 라이선스를 명시해야 함
- 리눅스 커널, Git, 마리아 DB, 워드프레스, 파이어폭스(v2.0) 등이 사용함  

### AGPL
- GPL을 기반으로 만든 라이선스
    - 네트워크로 상호 작용을 하는 소프트웨어의 소스코드도 공개해야 한다는 조항을 추가함
- MongoDB 등이 사용함

### LGPL
- 보다 완화된 GPL 라이선스
    - GPL 라이선스를 사용할 때 소스코드를 다시 GPL로 공개해야 한다는 부담 때문에 실무에서 사용되기 어려운 점을 보완함
    - 전체 소스코드를 공개하지 않고 사용된 오픈소스 라이브러리에 대한 소스코드만 공개하면 됨
- 파이어폭스(v2.1) 등이 사용함

### Apache License
- 소스코드 공개에 대한 의무사항이 라이선스에 포함되어 있지 않음
    - 아파치 라이선스 2.0을 꼭 포함시켜야 하고, 아파치재단의 소프트웨어라는 사실은 명시해야 함
- 안드로이드, 하둡 등이 사용함

### MIT License
- MIT에서 학생들을 지원하기 위해 만든 라이선스
- 가장 느슨한 조건을 가지고 있어서 많은 사람들이 사용하기 용이
- 사용자가 최소의 제한사항으로 원래 코드를 수정할 수 있도록 허용하는 무료 소프트웨어 라이센스
- 부트스트랩, Angular.js, Backbone.js, jQuery 등이 사용함


### 의무 강도에 따른 분류
| 카테고리        | 소스코드 공개 의무                         | 사례 |
|---------------|---------------------------------------|-----|
| Strong copy   | 2차 저작물 소스코드 공개 의무 있음            | GPL |
| Weak copyleft | 특정 조건에서 2차 저작물 소스코드 공개 의무 없음 | LGPL|
| Non copyleft  | 2차 저작물 소스코드 공개 의무 없음            | Apache, BSD, MIT |

<br>
<br>

### Untracked 파일 삭제
`git clean -f`: 모든 untracked 파일을 삭제함  
`git clean -i`: 대화형 프롬프트를 통해 지정한 untracked 파일만 삭제함