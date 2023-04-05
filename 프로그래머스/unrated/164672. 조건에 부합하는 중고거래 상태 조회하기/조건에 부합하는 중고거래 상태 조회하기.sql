-- 코드를 입력하세요
SELECT board_id, writer_id, title, price,
# replace(replace(replace(status, "RESERVED", "예약중"),"DONE","거래완료"),"SALE","판매중") as status
case when status = "RESERVED" then "예약중"
            when status = "DONE" then "거래완료"
            when status = "SALE" then "판매중"
            end as status
            # status
from used_goods_board
where date_format(created_date,"%Y-%m-%d") = "2022-10-05"
order by board_id desc