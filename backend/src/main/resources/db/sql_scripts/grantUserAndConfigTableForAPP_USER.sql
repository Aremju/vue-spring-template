-- You have to do this for every entity and sequence in your database
GRANT SELECT, UPDATE, INSERT, DELETE ON vuespringtemplate.public.<YOUR ENTITY HERE> TO ${APP_USER};
GRANT SELECT, UPDATE, USAGE ON vuespringtemplate.public.config_seq.<YOUR ENTITY SEQUENCEE HERE> TO ${APP_USER};