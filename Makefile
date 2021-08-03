build:
	docker buildx build --platform=linux/arm64 -t hacksore/hks:local . --load
test:
	docker run hacksore/hks:local