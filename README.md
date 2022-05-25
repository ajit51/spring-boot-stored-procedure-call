CREATE DEFINER=`root`@`localhost` PROCEDURE `getTicketDetails`()
begin
select * from ticket;
end


CREATE DEFINER=`root`@`localhost` PROCEDURE `getTicketByCategory`(in tcategory varchar(50))
begin
select * from ticket where category = tcategory;
end
