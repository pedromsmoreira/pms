## Create Pet

Register a pet in a country.

**URL**: `/v1/pets`
**Method**: `POST`

### Success Response

**Code**: `200 OK`

**Content Examples:**

Create a pet in the provided country code.

```json
{
    "id": "ABC-123",
    "countryIsoCode": "PT",
    "name": "dummy",
    "birthDate": {
        "year": "2019",
        "month": "11",
    },
    "deathDate": "Undefined",
    "gender": "Male",
    "color": "brown",
    "race": "Undefined",
    "healthStatus": "healthy",
    "ownerId": "ownerid-123",
    "ownerCountryCode": "PT"
}
```

## Error Responses

**Condition** : If provided Country ISO Code is invalid or does not exist.

**Code**: `400 BAD REQUEST`

**Content Examples:**

For a non existent Country ISO Code, the endpoint will always answer with an error response.

```json
{
    "error": {
        "code": "1",
        "message": "Invalid Country ISO Code",        
    }
}
```

**Condition** : If provided `ownerId` is invalid or does not exist.

**Code**: `400 BAD REQUEST`

**Content Examples:**

```json
{
    "error": {
        "code": "3",
        "message": "Owner is not registered or does not exist.",        
    }
}
```

**Condition** : If `name` field isn't provided.

**Code**: `400 BAD REQUEST`

**Content Examples:**

```json
{
    "error": {
        "code": "4",
        "message": "Mandatory field {field-name} wasn't provided or is invalid.",        
    }
}
```

**Condition** : If `birthDate` object is malformed

**Code**: `400 BAD REQUEST`

**Content Examples:**

```json
{
    "error": {
        "code": "4",
        "message": "Mandatory field {field-name} wasn't provided or is invalid.",        
    }
}
```