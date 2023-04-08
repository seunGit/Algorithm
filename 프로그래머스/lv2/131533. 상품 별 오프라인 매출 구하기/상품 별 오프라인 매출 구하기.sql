-- 코드를 입력하세요
SELECT pro.product_code, sum(pro.price * off.sales_amount) as sales
from product pro
join(select product_id, sales_amount from offline_sale) as off on pro.product_id = off.product_id
group by pro.product_id
order by sales desc, pro.product_code