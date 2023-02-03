# curl test script
curl -i -X GET "http://hello.info/product?number=1"
curl -i -X GET "http://hello.info/product" -H "Content-Type: application/json" -d '{"number":"1"}'

curl -i -X POST "http://hello.info/product" -d 'name=Product1' --data 'price=1500' --data 'stock=300'
curl -i -X PUT "http://hello.info/product" -d 'number=1' --data 'stock=500'
curl -i -X DELETE "http://hello.info/product" -d 'number=2'