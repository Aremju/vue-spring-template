-- You have to do this for every entity and sequence in your database
GRANT SELECT, UPDATE, INSERT, DELETE ON vuespringtemplate.public.some_object TO ${APP_USER};
GRANT SELECT, UPDATE, USAGE ON vuespringtemplate.public.some_object_id_seq TO ${APP_USER};