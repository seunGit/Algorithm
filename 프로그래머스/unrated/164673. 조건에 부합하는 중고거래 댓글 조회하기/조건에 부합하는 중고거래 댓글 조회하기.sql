-- 코드를 입력하세요
SELECT title, ugr.board_id, reply_id, ugr.writer_id, ugr.contents, date_format(ugr.created_date, "%Y-%m-%d") as created_date
from USED_GOODS_REPLY as ugr
left join USED_GOODS_BOARD as ugb
on ugr.board_id = ugb.board_id
where date_format(ugb.created_date, "%Y-%m") = "2022-10"
order by created_date, title