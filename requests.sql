INSERT INTO Cabinet(id, OfficeId) VALUES ('Кабинет', 0)
SELECT * FROM Cabinet LEFT JOIN Device ON Cabinet.DeviceId=Device.idDevice
SELECT * FROM Employee WHERE CabinetId = (SELECT idCabinet as cabId FROM Cabinet WHERE id="Кабинет")