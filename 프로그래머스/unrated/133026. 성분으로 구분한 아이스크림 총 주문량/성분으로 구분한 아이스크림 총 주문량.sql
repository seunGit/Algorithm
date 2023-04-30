-- 코드를 입력하세요
SELECT a.INGREDIENT_TYPE, sum(b.TOTAL_ORDER) as total_order
from ICECREAM_INFO a, FIRST_HALF b
where a.flavor = b.flavor
group by a.ingredient_type
order by b.total_order asc