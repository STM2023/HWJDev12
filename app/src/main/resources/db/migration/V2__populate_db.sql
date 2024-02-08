INSERT INTO client (name) VALUES ( 'Ramesh'),
                           ( 'Bogdan'),
                           ( 'Bill'),
                           ( 'Liliya'),
                           ( 'Vlad');

INSERT INTO planet  (id , name)      VALUES ( 'EARTH', 'EARTH'),
                                            ( 'NEPT', 'NEPTUNE'),
                                            ( 'MARS', 'MARS'),
                                            ( 'MOON', 'MOON'),
                                            ( 'VEN', 'VENUS'),
                                            ( 'MOON1', 'MOONmoon'),
                                            ( 'EARTH1', 'EARTHearth');

INSERT INTO ticket ( created_at, client_id, from_planet_id, to_planet_id)
            VALUES ('2024-06-16 16:37:23', 1 ,'EARTH','MARS'),
                    ('2024-08-10 15:35:25', 1 ,'MARS','EARTH'),
                    ('2024-05-12 18:33:33', 2 ,'EARTH','MOON'),
                    ('2024-09-16 10:30:20', 2 ,'MOON','MARS'),
                    ('2024-01-17 17:37:23', 3 ,'MOON','MARS'),
                    ('2024-02-21 12:37:23', 3 ,'MARS','VEN'),
                    ('2024-05-31 19:37:23', 3 ,'VEN','MARS'),
                    ('2024-10-11 14:37:23', 3 ,'MARS','EARTH'),
                    ('2024-10-16 18:34:23', 3 ,'EARTH','EARTH1'),
                    ('2024-11-26 20:36:23', 3 ,'EARTH1','NEPT'),
                    ('2024-06-16 22:10:23', 4 ,'EARTH','MARS'),
                    ('2024-06-16 21:12:23', 4 ,'MARS','MOON');