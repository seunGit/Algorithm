-- 코드를 입력하세요
SELECT WAREHOUSE_ID, WAREHOUSE_NAME	,ADDRESS,
COALESCE(FREEZER_YN, "N") as freezer_yn
FROM food_warehouse
where ADDRESS like "경기도%"
group by warehouse_id