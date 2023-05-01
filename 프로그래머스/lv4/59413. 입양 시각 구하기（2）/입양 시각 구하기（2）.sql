-- 코드를 입력하세요
set @hour := -1;
select (@hour := @hour + 1) as HOUR,
(select count(*) from ANIMAL_OUTS where HOUR(DATETIME) = @hour) as count
from ANIMAL_OUTS
where @hour < 23