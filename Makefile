build:
	docker build -t hacksore/hks:local .
test:
	docker run hacksore/hks:local