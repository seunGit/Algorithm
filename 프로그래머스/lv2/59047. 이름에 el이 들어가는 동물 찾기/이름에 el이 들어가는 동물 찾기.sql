-- 코드를 입력하세요
SELECT animal_id, name from ANIMAL_INS
where name like "%EL%" and animal_type = "dog"
order by name