-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_FORMAT(DATE_OF_BIRTH, "%Y-%m-%d") AS DATE_OF_BIRTH FROM member_profile
WHERE MONTH(DATE_OF_BIRTH) = 3
      -- "3월"을 위와 같이 표현 해도 됨
      AND TLNO IS NOT NULL
      -- NULL이 아니거나
      AND GENDER ="W"
      -- 성별이 "W"인 사람 
ORDER BY MEMBER_ID;