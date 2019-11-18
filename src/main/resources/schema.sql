CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
CREATE TABLE IF NOT EXISTS public.kv
(
    id    uuid DEFAULT uuid_generate_v4() PRIMARY KEY,
    key   varchar(100) NOT NULL,
    value varchar(100) NOT NULL
);
