-- 코드를 입력하세요
SELECT animal_type, count(animal_type) as count from ANIMAL_INS
where ANIMAL_type ="Cat" or ANIMAL_type ="Dog"
group by animal_type
order by animal_type