CREATE TABLE factura (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         fecha TIMESTAMP NOT NULL,
                         total DECIMAL(10,2) NOT NULL,
                         usuario_id BIGINT NOT NULL,
                         created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                         updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                         CONSTRAINT fk_factura_usuario FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);