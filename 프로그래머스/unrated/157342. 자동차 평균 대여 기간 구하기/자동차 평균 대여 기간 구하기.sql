-- 코드를 입력하세요
SELECT car_id,
       round(avg(datediff(END_DATE, START_DATE) +1), 1) AS AVERAGE_DURATION
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by car_id
having round(avg(datediff(END_DATE, START_DATE) +1), 1) >=7
order by AVERAGE_DURATION desc, car_id desc
