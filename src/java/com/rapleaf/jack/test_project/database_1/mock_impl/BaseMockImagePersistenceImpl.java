
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
/* generated from migration version 20110324000133 */
package com.rapleaf.jack.test_project.database_1.mock_impl;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;
import java.util.Set;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Timestamp;

import com.rapleaf.jack.AbstractMockDatabaseModel;
import com.rapleaf.jack.ModelWithId;

import com.rapleaf.jack.test_project.database_1.models.Image;
import com.rapleaf.jack.test_project.database_1.iface.IImagePersistence;

import com.rapleaf.jack.test_project.IDatabases;

public class BaseMockImagePersistenceImpl extends AbstractMockDatabaseModel<Image> implements IImagePersistence {
  private final IDatabases databases;

  private static AtomicInteger curId = new AtomicInteger(1);

  public BaseMockImagePersistenceImpl(IDatabases databases) {
    super();
    this.databases = databases;
  }

  @Override
  public ModelWithId create(Map<Enum, Object> fieldsMap) throws IOException {
    Integer user_id = (Integer) fieldsMap.get(Image._Fields.user_id);
    return create(user_id);
  }


  public Image create(final Integer user_id) throws IOException {
    int __id = curId.getAndIncrement();
    Image newInst = new Image(__id, user_id, databases);
    records.put(__id, newInst);
    clearForeignKeyCache();
    return newInst;
  }


  public Set<Image> find(Map<Enum, Object> fieldsMap) throws IOException {
    return super.realFind(fieldsMap);
  }
}
