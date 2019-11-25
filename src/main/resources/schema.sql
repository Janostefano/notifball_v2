CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
CREATE TABLE IF NOT EXISTS public.teams
(
    id          uuid DEFAULT uuid_generate_v4() PRIMARY KEY,
    external_id varchar(100) NOT NULL,
    name        varchar(100) NOT NULL,
    tla         varchar(100),
    address     varchar(100),
    phone       varchar(100),
    website     varchar(100),
    email       varchar(100),
    venue       varchar(100),
    short_name  varchar(100),
    logo_url    varchar(100),
    founded     smallint
);
