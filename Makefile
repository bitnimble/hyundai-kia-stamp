build:
	docker build --progress=plain -t hacksore/hks:local .
test:
	docker run hacksore/hks:local