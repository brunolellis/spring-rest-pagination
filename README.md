Spring REST Pagination example
========

This is a basic Spring application using pagination and REST API.

1. Compile and run your project using `mvn spring-boot:run`;
2. Open <http://localhost:8080/api/stores/search?q=Epping%20Main%20St>

The returned JSON structure is based on Spring Data REST and Page class.

```json
{
	"content": [
        {
            "id": "575aaaa4dcba0f71fd3f5e8a",
            "name": "Epping Main St",
            "address": {
                "street": "96 Calef Highway",
                "city": "Epping",
                "zip": "03042-2224",
                "location": {
                    "x": -71.073203,
                    "y": 43.031873
                }
            }
        }
	],
	"last": true,
	"totalPages": 1,
	"totalElements": 1,
	"sort": null,
	"numberOfElements": 1,
	"first": true,
	"size": 20,
	"number": 0
}
```
