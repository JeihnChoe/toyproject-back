INSERT INTO user_tb (`id`,`email`,`password`,`username`) VALUES ('1', 'ssar@nate.com', '12345678', 'ssar');

-- INSERT INTO product_tb (`id`,`product_name`,`description`,`image`, `price`) VALUES ('1', '기본에 슬라이딩 지퍼백 크리스마스/플라워에디션 에디션 외 주방용품 특가전', '', '/images/1.jpg', '1000');
-- INSERT INTO product_tb (`id`,`product_name`,`description`,`image`, `price`) VALUES ('2', '[황금약단밤 골드]2022년산 햇밤 칼집밤700g외/군밤용/생율', '', '/images/2.jpg', '2000');
-- INSERT INTO product_tb (`id`,`product_name`,`description`,`image`, `price`) VALUES ('3', '삼성전자 JBL JR310 외 어린이용/성인용 헤드셋 3종!', '', '/images/3.jpg', '30000');
-- INSERT INTO product_tb (`id`,`product_name`,`description`,`image`, `price`) VALUES ('4', '바른 누룽지맛 발효효소 2박스 역가수치보장 / 외 7종', '', '/images/4.jpg', '4000');
-- INSERT INTO product_tb (`id`,`product_name`,`description`,`image`, `price`) VALUES ('5', '[더주] 컷팅말랑장족, 숏다리 100g/300g 외 주전부리 모음 /중독성 최고/마른안주', '', '/images/5.jpg', '5000');
-- INSERT INTO product_tb (`id`,`product_name`,`description`,`image`, `price`) VALUES ('6', '굳지않는 앙금절편 1,050g 2팩 외 우리쌀떡 모음전', '', '/images/6.jpg', '15900');
-- INSERT INTO product_tb (`id`,`product_name`,`description`,`image`, `price`) VALUES ('7', 'eoe 이너딜리티 30포, 오렌지맛 고 식이섬유 보충제', '', '/images/7.jpg', '26800');
-- INSERT INTO product_tb (`id`,`product_name`,`description`,`image`, `price`) VALUES ('8', '제나벨 PDRN 크림 2개. 피부보습/진정 케어', '', '/images/8.jpg', '25900');
-- INSERT INTO product_tb (`id`,`product_name`,`description`,`image`, `price`) VALUES ('9', '플레이스테이션 VR2 호라이즌 번들. 생생한 몰입감', '', '/images/9.jpg', '797000');
-- INSERT INTO product_tb (`id`,`product_name`,`description`,`image`, `price`) VALUES ('10', '통영 홍 가리비 2kg, 2세트 구매시 1kg 추가증정', '', '/images/10.jpg', '8900');
-- INSERT INTO product_tb (`id`,`product_name`,`description`,`image`, `price`) VALUES ('11', '아삭한 궁채 장아찌 1kg 외 인기 반찬 모음전', '', '/images/11.jpg', '6900');
-- INSERT INTO product_tb (`id`,`product_name`,`description`,`image`, `price`) VALUES ('12', '깨끗한나라 순수소프트 30롤 2팩. 무형광, 도톰 3겹', '', '/images/12.jpg', '28900');
-- INSERT INTO product_tb (`id`,`product_name`,`description`,`image`, `price`) VALUES ('13', '생활공작소 초미세모 칫솔 12입 2개+가글 증정', '', '/images/13.jpg', '9900');
-- INSERT INTO product_tb (`id`,`product_name`,`description`,`image`, `price`) VALUES ('14', '경북 영천 샤인머스켓 가정용 1kg 2수 내외', '', '/images/14.jpg', '9900');
INSERT INTO product_tb (`id`,`product_name`,`product_eng_name`,`code`, `description`,`image`,`price`,`note`) VALUES ('1', '아이스아메리카노','Iced-Ameriano','1','물타고얼음넣은 에스프레소입니다.','/images/1.jpg','148000','Best');


    -- private int id; // PK
    -- private String productName; // 상품명
    -- private String productEngName; // 상품영문명
    -- private int code; // 상품코드 (음료1 푸드2)
    -- private String description; // 상품설명
    -- private String image; // 상품이미지
    -- private int price; // 가격
    -- private String note; // hot,new,best