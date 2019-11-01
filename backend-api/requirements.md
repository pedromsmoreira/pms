# Requirements

In this API I want to:

- Manage Pets (dogs, cats, birds, fishes, exotic animals, etc...)
- Manage Pet Hospitals/Veterinarians
  - Schedule appointments
  - Check in/out Pets
- Publish Pets for adoption
- Manage owners
- Blacklist/whitelist owners

## Implementation Ideas

Since these entities have a lot of connections, I would like to use a graph database.

Options:

- [Datastax DSE Graph Database](https://www.datastax.com/products/datastax-graph)
- [Neo4J](https://neo4j.com/)
- [Dgraph](https://dgraph.io/)
- [OrientDb](https://orientdb.com/)
- more options...
