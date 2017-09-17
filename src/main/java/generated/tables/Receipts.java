/**
 * This class is generated by jOOQ
 */
package generated.tables;


import generated.Keys;
import generated.Public;
import generated.tables.records.ReceiptsRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Receipts extends TableImpl<ReceiptsRecord> {

	private static final long serialVersionUID = -312685342;

	/**
	 * The reference instance of <code>public.receipts</code>
	 */
	public static final Receipts RECEIPTS = new Receipts();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ReceiptsRecord> getRecordType() {
		return ReceiptsRecord.class;
	}

	/**
	 * The column <code>public.receipts.id</code>.
	 */
	public final TableField<ReceiptsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.receipts.uploaded</code>.
	 */
	public final TableField<ReceiptsRecord, Timestamp> UPLOADED = createField("uploaded", org.jooq.impl.SQLDataType.TIMESTAMP.defaulted(true), this, "");

	/**
	 * The column <code>public.receipts.merchant</code>.
	 */
	public final TableField<ReceiptsRecord, String> MERCHANT = createField("merchant", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>public.receipts.amount</code>.
	 */
	public final TableField<ReceiptsRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL.precision(12, 2), this, "");

	/**
	 * The column <code>public.receipts.tag</code>.
	 */
	public final TableField<ReceiptsRecord, String> TAG = createField("tag", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>public.receipts.receipt_type</code>.
	 */
	public final TableField<ReceiptsRecord, Integer> RECEIPT_TYPE = createField("receipt_type", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>public.receipts</code> table reference
	 */
	public Receipts() {
		this("receipts", null);
	}

	/**
	 * Create an aliased <code>public.receipts</code> table reference
	 */
	public Receipts(String alias) {
		this(alias, RECEIPTS);
	}

	private Receipts(String alias, Table<ReceiptsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Receipts(String alias, Table<ReceiptsRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<ReceiptsRecord, Integer> getIdentity() {
		return Keys.IDENTITY_RECEIPTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ReceiptsRecord> getPrimaryKey() {
		return Keys.CONSTRAINT_F;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ReceiptsRecord>> getKeys() {
		return Arrays.<UniqueKey<ReceiptsRecord>>asList(Keys.CONSTRAINT_F);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Receipts as(String alias) {
		return new Receipts(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Receipts rename(String name) {
		return new Receipts(name, null);
	}
}
