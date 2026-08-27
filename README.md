# event-claim-service

한정 수량의 포인트·쿠폰 등 이벤트 혜택을 안전하게 지급하기 위한 Spring Boot 백엔드 프로젝트입니다.      
동시 요청과 네트워크 재시도가 발생해도 정원을 초과하지 않고, 한 사용자가 중복으로 혜택을 받지 않으며, 혜택 지급 기록과 포인트 원장이 일관되게 저장되는 구조를 목표로 합니다.
자세한 내용은 블로그에서 확인하실 수 있습니다.

<p> 
  <a href="https://phantom-stew-a98.notion.site/3c6b3160e4c0803fa0a8d00c20aba25f" title="프로젝트 상세 문서">
    <img src="https://www.notion.so/images/favicon.ico" alt="Notion" width="18" /> notion
  </a>
</p>

## 프로젝트 목표

- 이벤트 정원을 초과한 혜택 지급 방지
- 동일 사용자의 중복 수령 방지
- 동일 요청 재시도 시 중복 지급 방지
- 혜택 지급 기록과 포인트 원장의 원자적 저장
- 동시성·실패 상황을 자동화 테스트로 검증
- 측정 결과를 근거로 성능 개선 과정 기록

## 기술 스택

| 구분 | 도구 | 용도 | 상태 |
| --- | --- | --- | --- |
| Language | Java 21 | 애플리케이션 개발 언어 | 적용 |
| Framework | Spring Boot 4.1.1 | 백엔드 애플리케이션 프레임워크 | 적용 |
| Web | Spring Web MVC | REST API 구현 | 적용 |
| Build Tool | Gradle | 빌드 및 의존성 관리 | 적용 |
| Testing | JUnit Platform | 자동화 테스트 실행 | 적용 |
| Database | MySQL | 이벤트·지급 기록·포인트 원장 저장 | 도입 예정 |
| ORM | Spring Data JPA | 데이터베이스 접근 및 객체 매핑 | 도입 예정 |
| API Documentation | Swagger / OpenAPI | API 문서화 및 수동 API 확인 | 도입 예정 |
| Containerization | Docker / Docker Compose | 로컬 실행 환경 구성 | TBD |
| Code Quality Tool | Checkstyle 또는 Spotless | 코드 스타일 및 품질 관리 | TBD |
| CI | GitHub Actions | 빌드·테스트 자동화 | TBD |
| Monitoring | TBD | 로그·지표 수집 및 상태 확인 | TBD |

## 주요 기능

- 이벤트 생성
- 이벤트 혜택 지급 요청
- 사용자별 혜택 지급 이력 조회
- 사용자별 포인트 원장 조회

> 현재는 Spring Boot 프로젝트 초기 구성 단계이며, 실제 API 기능은 순차적으로 구현할 예정입니다.

## 정합성 검증 기준

정원 100명인 이벤트에 서로 다른 사용자 1,000명이 동시에 요청했을 때 다음 조건을 만족하는 것을 목표로 합니다.

- 성공한 혜택 지급 건수: 100건
- 포인트 원장 기록: 100건
- 이벤트 잔여 수량: 0건
- 사용자 중복 지급: 0건
- 같은 `requestId` 재시도로 인한 중복 기록: 0건
- 지급 기록 또는 포인트 원장만 남는 부분 성공 상태: 0건

## API

TBD

## 실행 방법

TBD

## 테스트

TBD

## 문서

- [요구사항서](document/요구사항서.md)
- [프로젝트 계획서](document/프로젝트_계획서.md)
- [1차 구현 계획서](document/구현계획서_1차.md)
- [프로젝트 진행상황](document/프로젝트_진행상황.md)
