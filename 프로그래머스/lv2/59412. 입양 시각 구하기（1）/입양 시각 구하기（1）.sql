-- 코드를 입력하세요
SELECT hour(datetime) as hour, count(datetime) as count
from ANIMAL_OUTS
group by hour(datetime)
having hour >= 9 and hour <= 19
order by hour